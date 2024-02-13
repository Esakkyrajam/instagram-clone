package com.instagramclone.api.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.instagramclone.api.DTO.SignInRequest;
import com.instagramclone.api.DTO.SignUpRequest;
import com.instagramclone.api.Services.AuthenticationService;
import com.instagramclone.api.Services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationService authenticationService;
    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody SignUpRequest signUpRequest){
        return userService.signUp(signUpRequest);
    }

    @PostMapping("/signin")
    public ResponseEntity<String> signIn(@RequestBody SignInRequest signInRequest){
        return userService.signIn(signInRequest);
    }

    @DeleteMapping("/signout")
    public ResponseEntity<String> signOut(@RequestParam String email , @RequestParam String token){
        HttpStatus status;
        String msg=null;
        if(authenticationService.authenticate(email,token)) {
            authenticationService.deleteToken(token);
            msg = "logged out Successfully!!";
            status = HttpStatus.OK;
        }else {
            msg = "Invalid User";
            status = HttpStatus.FORBIDDEN;
        }
        return new ResponseEntity<>(msg , status);
    }

    //Update user details
    @PutMapping
    public ResponseEntity<String> updateUser(@RequestParam String email , @RequestParam String token , @RequestBody SignUpRequest updateUserRequest){
        HttpStatus status;
        String msg=null;
        if(authenticationService.authenticate(email,token)) {
            try{
                userService.updateUser(updateUserRequest , token);
                status = HttpStatus.OK;
                msg = "User updated successfully..!!";
            }catch (Exception e){
                msg = "Enter valid information!!";
                status = HttpStatus.BAD_REQUEST;
            }
        }else{
            msg = "Invalid User";
            status = HttpStatus.FORBIDDEN;
        }
        return new ResponseEntity<String>(msg , status);
    }

    @PostMapping("/follow/{myId}/{otherId}")
    public String followUser(@PathVariable Long myId, @PathVariable Long otherId,@RequestParam String email , @RequestParam String token){
        if(authenticationService.authenticate(email,token)){
            return userService.followUser( myId, otherId);
        }else{
            return "Invalid User!!";
        }
    }

}
