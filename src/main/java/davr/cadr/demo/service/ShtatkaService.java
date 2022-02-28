package davr.cadr.demo.service;

import davr.cadr.demo.entitiy.Shtatka;
import davr.cadr.demo.entitiy.enums.SubdivisionType;
import davr.cadr.demo.payload.ApiResponse;
import davr.cadr.demo.payload.ShtatkaDTO;
import davr.cadr.demo.repository.ShtatkaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShtatkaService {

    private  final ShtatkaRepository shtatkaRepository;

    public ApiResponse add(ShtatkaDTO shtatkaDTO){

        boolean existsByWorkplaceName = shtatkaRepository.existsByWorkplaceName(shtatkaDTO.getWorkplaceName());
        if (existsByWorkplaceName){
            return new ApiResponse("Bunday turdagi bo`lim nomi mavjud!!!!", false);
        }

        Shtatka shtatka = new Shtatka();
        shtatka.setWorkplaceName(shtatkaDTO.getWorkplaceName());
        shtatka.setSubdivisionType(shtatkaDTO.getSubdivisionType());
        shtatkaRepository.save(shtatka);

        return new ApiResponse("Shtatka Muvofaqqiyatli saqlandi !!!!", true);
    }

    public List<Shtatka> getAll(){
        return shtatkaRepository.findAll();
    }
}
