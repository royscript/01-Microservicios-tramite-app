package cl.amisoft.tramiteapp.controller;

import cl.amisoft.tramiteapp.service.TramiteCausaService;
import cl.amisoft.tramiteapp.vo.TramiteCausaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tramite-causa")
public class TramiteCausaController {
    private final TramiteCausaService tramiteCausaService;
    @Autowired
    public TramiteCausaController(TramiteCausaService tramiteCausaService){
        this.tramiteCausaService = tramiteCausaService;
    }
    @GetMapping(value = "/{idCausa}", produces = "application/json")
    public List<TramiteCausaVo> obtenerTodosPorCausa(@PathVariable(name = "idCausa") Long idCausa){
        return tramiteCausaService.obtenerTodosPorCausa(idCausa);
    }
}
