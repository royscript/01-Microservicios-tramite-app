package cl.amisoft.tramiteapp.impl;

import cl.amisoft.tramiteapp.dao.TramiteCausaDao;
import cl.amisoft.tramiteapp.model.TramiteCausa;
import cl.amisoft.tramiteapp.service.TramiteCausaService;
import cl.amisoft.tramiteapp.vo.TramiteCausaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service /* Indicamos que se trata de un servicio */
public class TramiteCausaServiceImpl implements TramiteCausaService {
    private final TramiteCausaDao tramiteCausaDao;
    @Autowired /* indicamos la inyeccion de dependencias*/
    public TramiteCausaServiceImpl(TramiteCausaDao tramiteCausaDao){/* Inyeccion del DAO*/
        this.tramiteCausaDao = tramiteCausaDao;
    }
    @Override /* implementamos y reescribirmos el servicio */
    public List<TramiteCausaVo> obtenerTodosPorCausa(Long idCausa){
        TramiteCausa tc = new TramiteCausa.Builder().causa(idCausa).build();
        System.out.println(tc);
        List<TramiteCausa> tramiteCausas = tramiteCausaDao.obtenerTodosPorCausa(tc);
        if(!tramiteCausas.isEmpty()){
            return  tramiteCausas.stream().map( t -> new TramiteCausaVo.Builder()
                    .id(t.getId())
                    .causas(t.getCausa())
                    .fechaCreacion(t.getFechaCreacion())
                    .nombreTramite(t.getNombreTramite())
                    .build()).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
