/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.impl;

import java.util.Set;

import org.apache.lucene.analysis.Analyzer;
import org.hibernate.search.SearchFactory;
import org.hibernate.search.query.dsl.QueryContextBuilder;


/**
 * Implementation of the public API: a simple delegate to the actual implementor.
 *
 * @author Sanne Grinovero (C) 2014 Red Hat Inc.
 * @since 5.0
 */
final class SearchFactoryImpl implements SearchFactory {

	private final Object searchIntegrator;

	public SearchFactoryImpl(Object searchIntegrator) {
		this.searchIntegrator = searchIntegrator;
	}

	@Override
	public void optimize() {
		throw new UnsupportedOperationException( "To be implemented by delegating to Search 6 APIs." );
	}

	@Override
	public void optimize(Class<?> clazz) {
		throw new UnsupportedOperationException( "To be implemented by delegating to Search 6 APIs." );
	}

	@Override
	public Analyzer getAnalyzer(String name) {
		throw new UnsupportedOperationException( "To be implemented by delegating to Search 6 APIs." );
	}

	@Override
	public Analyzer getAnalyzer(Class<?> clazz) {
		throw new UnsupportedOperationException( "To be implemented by delegating to Search 6 APIs." );
	}

	@Override
	public QueryContextBuilder buildQueryBuilder() {
		throw new UnsupportedOperationException( "To be implemented by delegating to Search 6 APIs." );
	}

	@Override
	public Set<Class<?>> getIndexedTypes() {
		throw new UnsupportedOperationException( "To be implemented by delegating to Search 6 APIs." );
	}

	@Override
	public <T> T unwrap(Class<T> cls) {
		throw new UnsupportedOperationException( "To be implemented by delegating to Search 6 APIs." );
	}

}