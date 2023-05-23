package cl.amisoft.tramiteapp.service;

import cl.amisoft.tramiteapp.vo.TramiteCausaVo;

import java.util.List;

public interface TramiteCausaService {
    List<TramiteCausaVo> obtenerTodosPorCausa(Long idCausa);
}
