package davr.cadr.demo.controller;

import davr.cadr.demo.entitiy.WorkPlace;
import davr.cadr.demo.payload.ApiResponse;
import davr.cadr.demo.payload.WorkPlaceDTO;
import davr.cadr.demo.service.WorkplaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/workplace")
public class WorkplaceController {

    private final WorkplaceService workplaceService;

    @PostMapping
    public HttpEntity<?> add(@RequestBody WorkPlaceDTO workPlaceDTO){

        ApiResponse response = workplaceService.add(workPlaceDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public List<WorkPlace> getAll(){
        return workplaceService.getAll();
    }

}
