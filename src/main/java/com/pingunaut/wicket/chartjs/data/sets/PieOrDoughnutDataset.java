/*******************************************************************************
 * Copyright 2016 Martin Spielmann
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pingunaut.wicket.chartjs.data.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Class PieOrDoughnutDataset provides all information needed for Pies and
 * Doughnuts.
 * 
 * @author Martin Spielmann
 */
public abstract class PieOrDoughnutDataset implements NumberDataContaining {

	private static final long serialVersionUID = 1L;

	// String - the color to fill the area under the line with if fill is true
	private String backgroundColor = "rgba(220,220,220,0.2)";

	// The actual data
	private final List<Number> data = new ArrayList<>();

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public List<Number> getData() {
		return data;
	}

	public void addData(List<Number> data) {
		this.data.addAll(data);
	}

	public void addData(Number... data) {
		this.data.addAll(Arrays.asList(data));
	}

}
