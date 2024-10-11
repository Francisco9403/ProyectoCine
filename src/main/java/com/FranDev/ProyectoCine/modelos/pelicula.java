package com.FranDev.ProyectoCine.modelos;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

@Entity
public class pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_pelicula")
    private Integer id;

    @NotBlank
    private String titulo;
    @NotBlank
    private String sinopsis;
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fechaEstreno;

    private String youtubeTrailerID;

    private String rutaPortada;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "genero_pelicula",
            joinColumns = @JoinColumn(name = "id_pelicula"),
            inverseJoinColumns= @JoinColumn(name = "id_genero"))
    private List<genero> generos;

    @Transient
    private MultipartFile portada;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NotBlank String titulo) {
        this.titulo = titulo;
    }

    public @NotBlank String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(@NotBlank String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public @NotNull LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(@NotNull LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getYoutubeTrailerID() {
        return youtubeTrailerID;
    }

    public void setYoutubeTrailerID(String youtubeTrailerID) {
        this.youtubeTrailerID = youtubeTrailerID;
    }

    public String getRutaPortada() {
        return rutaPortada;
    }

    public void setRutaPortada(String rutaPortada) {
        this.rutaPortada = rutaPortada;
    }

    public List<genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<genero> generos) {
        this.generos = generos;
    }

    public MultipartFile getPortada() {
        return portada;
    }

    public void setPortada(MultipartFile portada) {
        this.portada = portada;
    }

    public pelicula(Integer id, String titulo, String sinopsis, LocalDate fechaEstreno, String youtubeTrailerID, String rutaPortada, List<genero> generos, MultipartFile portada) {
        this.id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.fechaEstreno = fechaEstreno;
        this.youtubeTrailerID = youtubeTrailerID;
        this.rutaPortada = rutaPortada;
        this.generos = generos;
        this.portada = portada;
    }

    public pelicula() {
    }

    public pelicula(String titulo, String sinopsis, LocalDate fechaEstreno, String youtubeTrailerID, String rutaPortada, List<genero> generos, MultipartFile portada) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.fechaEstreno = fechaEstreno;
        this.youtubeTrailerID = youtubeTrailerID;
        this.rutaPortada = rutaPortada;
        this.generos = generos;
        this.portada = portada;
    }





}
