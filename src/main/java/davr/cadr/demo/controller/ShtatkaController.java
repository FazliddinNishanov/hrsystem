package davr.cadr.demo.controller;

import davr.cadr.demo.entitiy.Shtatka;
import davr.cadr.demo.payload.ApiResponse;
import davr.cadr.demo.payload.ShtatkaDTO;
import davr.cadr.demo.service.ShtatkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/shtatka")
public class ShtatkaController {


    private final ShtatkaService shtatkaService;

    @PostMapping
    public HttpEntity<?> add(@RequestBody ShtatkaDTO shtatkaDTO){
        ApiResponse response = shtatkaService.add(shtatkaDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public List<Shtatka> getAll(){
        return shtatkaService.getAll();
    }
}
