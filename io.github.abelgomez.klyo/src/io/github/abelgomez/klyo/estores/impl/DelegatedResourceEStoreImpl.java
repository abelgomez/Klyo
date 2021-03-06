/*******************************************************************************
 * Copyright (c) 2018 Abel G�mez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Abel G�mez - initial API and implementation
 *******************************************************************************/
package io.github.abelgomez.klyo.estores.impl;

import java.util.Date;
import java.util.SortedMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;

import io.github.abelgomez.klyo.estores.SearcheableResourceEStore;
import io.github.abelgomez.klyo.estores.SearcheableTimedResourceEStore;


/**
 * A {@link SearcheableResourceEStore} wrapper that delegates method calls to an
 * internal {@link SearcheableResourceEStore}
 * 
 * @author agomez
 * 
 */
public class DelegatedResourceEStoreImpl implements SearcheableTimedResourceEStore {

	/**
	 * The wrapped {@link SearcheableResourceEStore}
	 */
	protected SearcheableTimedResourceEStore eStore;

	public DelegatedResourceEStoreImpl(SearcheableTimedResourceEStore eStore) {
		this.eStore = eStore;
	}

	public Resource getResource() {
		return eStore.getResource();
	}

	public EObject getEObject(String id) {
		return eStore.getEObject(id);
	}

	public Object getAt(Date date, InternalEObject object, EStructuralFeature feature, int index) {
		return eStore.getAt(date, object, feature, index);
	}
	
	public SortedMap<Date, Object> getAllBetween(Date startDate, Date endDate, InternalEObject object, EStructuralFeature feature, int index) {
		return eStore.getAllBetween(startDate, endDate, object, feature, index);
	}

	public boolean isSetAt(Date date, InternalEObject object, EStructuralFeature feature) {
		return eStore.isSetAt(date, object, feature);
	}

	public boolean isEmptyAt(Date date, InternalEObject object, EStructuralFeature feature) {
		return eStore.isEmptyAt(date, object, feature);
	}

	public int sizeAt(Date date, InternalEObject object, EStructuralFeature feature) {
		return eStore.sizeAt(date, object, feature);
	}

	public boolean containsAt(Date date, InternalEObject object, EStructuralFeature feature, Object value) {
		return eStore.containsAt(date, object, feature, value);
	}

	public int indexOfAt(Date date, InternalEObject object, EStructuralFeature feature, Object value) {
		return eStore.indexOfAt(date, object, feature, value);
	}

	public int lastIndexOfAt(Date date, InternalEObject object, EStructuralFeature feature, Object value) {
		return eStore.lastIndexOfAt(date, object, feature, value);
	}

	public Object[] toArrayAt(Date date, InternalEObject object, EStructuralFeature feature) {
		return eStore.toArrayAt(date, object, feature);
	}

	public <T> T[] toArrayAt(Date date, InternalEObject object, EStructuralFeature feature, T[] array) {
		return eStore.toArrayAt(date, object, feature, array);
	}

	public int hashCodeAt(Date date, InternalEObject object, EStructuralFeature feature) {
		return eStore.hashCodeAt(date, object, feature);
	}

	public InternalEObject getContainerAt(Date date, InternalEObject object) {
		return eStore.getContainerAt(date, object);
	}

	public EStructuralFeature getContainingFeatureAt(Date date, InternalEObject object) {
		return eStore.getContainingFeatureAt(date, object);
	}

	public Object get(InternalEObject object, EStructuralFeature feature, int index) {
		return eStore.get(object, feature, index);
	}

	public Object set(InternalEObject object, EStructuralFeature feature, int index, Object value) {
		return eStore.set(object, feature, index, value);
	}

	public boolean isSet(InternalEObject object, EStructuralFeature feature) {
		return eStore.isSet(object, feature);
	}

	public void unset(InternalEObject object, EStructuralFeature feature) {
		eStore.unset(object, feature);
	}

	public boolean isEmpty(InternalEObject object, EStructuralFeature feature) {
		return eStore.isEmpty(object, feature);
	}

	public int size(InternalEObject object, EStructuralFeature feature) {
		return eStore.size(object, feature);
	}

	public boolean contains(InternalEObject object, EStructuralFeature feature, Object value) {
		return eStore.contains(object, feature, value);
	}

	public int indexOf(InternalEObject object, EStructuralFeature feature, Object value) {
		return eStore.indexOf(object, feature, value);
	}

	public int lastIndexOf(InternalEObject object, EStructuralFeature feature, Object value) {
		return eStore.lastIndexOf(object, feature, value);
	}

	public void add(InternalEObject object, EStructuralFeature feature, int index, Object value) {
		eStore.add(object, feature, index, value);
	}

	public Object remove(InternalEObject object, EStructuralFeature feature, int index) {
		return eStore.remove(object, feature, index);
	}

	public Object move(InternalEObject object, EStructuralFeature feature, int targetIndex, int sourceIndex) {
		return eStore.move(object, feature, targetIndex, sourceIndex);
	}

	public void clear(InternalEObject object, EStructuralFeature feature) {
		eStore.clear(object, feature);
	}

	public Object[] toArray(InternalEObject object, EStructuralFeature feature) {
		return eStore.toArray(object, feature);
	}

	public <T> T[] toArray(InternalEObject object, EStructuralFeature feature, T[] array) {
		return eStore.toArray(object, feature, array);
	}
	
	@Override
	public SortedMap<Date, Object[]> toArrayAllBetween(Date startDate, Date endDate, InternalEObject object, EStructuralFeature feature) {
		return eStore.toArrayAllBetween(startDate, endDate, object, feature);
	}


	public int hashCode(InternalEObject object, EStructuralFeature feature) {
		return eStore.hashCode(object, feature);
	}

	public InternalEObject getContainer(InternalEObject object) {
		return eStore.getContainer(object);
	}

	public EStructuralFeature getContainingFeature(InternalEObject object) {
		return eStore.getContainingFeature(object);
	}

	public EObject create(EClass eClass) {
		return eStore.create(eClass);
	}


}
