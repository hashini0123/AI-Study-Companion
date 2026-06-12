package edu.icet.controller;

import edu.icet.dto.UsersDTO;
import edu.icet.dto.UsersDTO;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<String> saveUser(@RequestBody UsersDTO usersDTO){
        userService.saveUser(usersDTO);
        return ResponseEntity.ok("User saved successfully!");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateUser(@RequestBody UsersDTO usersDTO){
        boolean isUpdate = userService.updateUser(usersDTO);

        if(isUpdate){
            return ResponseEntity.ok("User update successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
        }
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id){
        boolean isDelete = userService.deleteUser(id);

        if(isDelete){
            return ResponseEntity.ok("User delete successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
        }
    }

    @GetMapping("/get-All")
    public ResponseEntity<List<UsersDTO>> getAllUsers(){
        List<UsersDTO> allUser = userService.getAllUsers();
        return ResponseEntity.ok(allUser);
    }

}
