/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
package com.earasoft.rdf4j.sail.nativerockrdf;

import java.io.Serializable;

import com.earasoft.rdf4j.sail.nativerockrdf.model.NativeValue;

/**
 * A {@link ValueStore ValueStore} revision for {@link NativeValue NativeValue} objects. For a cached value ID of a
 * NativeValue to be valid, the revision object needs to be equal to the concerning ValueStore's revision object. The
 * ValueStore's revision object is changed whenever values are removed from it or IDs are changed.
 * 
 * @author Arjohn Kampman
 */
public class ValueStoreRevision implements Serializable {

	/*-----------*
	 * Constants *
	 *-----------*/

	private static final long serialVersionUID = -2434063125560285009L;

	/*-----------*
	 * Variables *
	 *-----------*/

	transient private final ValueStore valueStore;

	/*--------------*
	 * Constructors *
	 *--------------*/

	public ValueStoreRevision(ValueStore valueStore) {
		this.valueStore = valueStore;
	}

	/*---------*
	 * Methods *
	 *---------*/

	public ValueStore getValueStore() {
		return valueStore;
	}
}
