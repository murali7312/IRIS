package com.temenos.interaction.sdk.entity;

/*
 * #%L
 * interaction-sdk
 * %%
 * Copyright (C) 2012 - 2013 Temenos Holdings N.V.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */


import java.util.ArrayList;
import java.util.List;

/**
 * This class holds information about the entity model
 */
public class EntityModel {

	private List<EMEntity> entities = new ArrayList<EMEntity>();
	private String modelName;
	
	public EntityModel(String modelName) {
		this.modelName = modelName;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void addEntity(EMEntity entity) {
		entities.add(entity);
	}
	
	public List<EMEntity> getEntities() {
		return entities;
	}
}
