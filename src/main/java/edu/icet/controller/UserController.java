package edu.icet.controller;

import edu.icet.dto.UsersDTO;
import edu.icet.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {

    private final UsersService usersService;

    @PostMapping("/save")
    public ResponseEntity<String> saveUsers(@RequestBody UsersDTO usersDTO){
        usersService.saveUsers(usersDTO);
        return ResponseEntity.ok("User saved successfully!");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateUsers(@PathVariable String id , @RequestBody UsersDTO usersDTO){
        boolean isUpdate = usersService.updateUsers(id, usersDTO);

        if(isUpdate){
            return ResponseEntity.ok("User update successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
        }
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<String> deleteUsers(@PathVariable String id){
        boolean isDelete = usersService.deleteUsers(id);

        if(isDelete){
            return ResponseEntity.ok("User delete successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
        }
    }

    @GetMapping("/get-All")
    public ResponseEntity<List<UsersDTO>> getAllUsers(){
        List<UsersDTO> allUsers = usersService.getAllUsers();
        return ResponseEntity.ok(allUsers);
    }

}
