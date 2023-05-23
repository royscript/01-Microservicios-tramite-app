package cl.amisoft.tramiteapp.vo;

import java.io.Serializable;
import java.time.LocalDate;

public class TramiteCausaVo implements Serializable {
    private static final long serialVersionUID = 4794192614088964788L;
    private Long id;
    private Long causas;
    private String nombreTramite;
    private LocalDate fechaCreacion;

    public Long getId() {
        return id;
    }

    public Long getCausas() {
        return causas;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCausas(Long causas) {
        this.causas = causas;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public TramiteCausaVo() {
    }

    public TramiteCausaVo(Builder builder){
        this.id = builder.id;
        this.causas = builder.causas;
        this.nombreTramite = builder.nombreTramite;
        this.fechaCreacion = builder.fechaCreacion;
    }

    /* Se utiliza para mantener los constructores de las clases
       cuando tienen mas de 5 atributos. */
    public static class Builder{
        private Long id;
        private Long causas;
        private String nombreTramite;
        private LocalDate fechaCreacion;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder causas(Long causas) {
            this.causas = causas;
            return this;
        }

        public Builder nombreTramite(String nombreTramite) {
            this.nombreTramite = nombreTramite;
            return this;
        }

        public Builder fechaCreacion(LocalDate fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
            return this;
        }
        public TramiteCausaVo build(){
            return new TramiteCausaVo(this);
        }
    }
}
