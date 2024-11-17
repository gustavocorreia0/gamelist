package com.gulari.gamelist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

	@EmbeddedId
	private BelongingAux belongingAux = new BelongingAux();
	
	private Integer position;

	public Belonging() {
		
	}

	public Belonging(Game game, GameList gamelist) {
		belongingAux.setGame(game);
		belongingAux.setGameList(gamelist);
		position = position;
	}

	public BelongingAux getBelongingAux() {
		return belongingAux;
	}

	public void setBelongingAux(BelongingAux belongingAux) {
		this.belongingAux = belongingAux;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(belongingAux);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(belongingAux, other.belongingAux);
	}
	
}
