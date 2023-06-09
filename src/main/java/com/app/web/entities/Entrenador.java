package com.app.web.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Entrenador", schema = "caso73")
public class Entrenador {
	@Id
    private Integer id_persona;
	@Column(name = "direccion", nullable = false)
	private String direccion;
	@OneToOne
	@MapsId
    @JoinColumn(name = "persona_id")
	private Persona persona;

}
