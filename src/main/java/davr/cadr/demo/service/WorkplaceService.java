package davr.cadr.demo.service;

import davr.cadr.demo.entitiy.Shtatka;
import davr.cadr.demo.entitiy.WorkPlace;
import davr.cadr.demo.payload.ApiResponse;
import davr.cadr.demo.payload.WorkPlaceDTO;
import davr.cadr.demo.repository.ShtatkaRepository;
import davr.cadr.demo.repository.WorkplaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WorkplaceService {

    private final WorkplaceRepository workplaceRepository;

    private final ShtatkaRepository shtatkaRepository;

    public ApiResponse add(WorkPlaceDTO workPlaceDTO){
        Optional<Shtatka> byId = shtatkaRepository.findById(workPlaceDTO.getShtatkaId());
        if (!byId.isPresent()){
            return new ApiResponse("Bunday Bo`lim yo`q !!!", false);
        }
        WorkPlace workPlace = new WorkPlace();
        workPlace.setShtatka(byId.get());
        workPlace.setSubdivisionType(workPlaceDTO.getSubdivisionType());
        workPlace.setPosition(workPlaceDTO.getPosition());
        workPlace.setDischarge(workPlaceDTO.getDischarge());
        workPlace.setShtatBirligi(workPlaceDTO.getShtatBirligi());
        workPlace.setSalary(workPlaceDTO.getSalary());
        workPlace.setSlaryStatus(false);
        workPlace.setFreeWorkPlace(workPlaceDTO.getFreeWorkPlace());

        workplaceRepository.save(workPlace);
        return new ApiResponse("ish joyi saqlandi!!!!", true);

    }

    public List<WorkPlace> getAll(){
        return workplaceRepository.findAll();
    }

}
