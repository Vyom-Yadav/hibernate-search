/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.mapper.javabean.loading;

import java.util.List;

/**
 * A sink for use by a {@link MassIdentifierLoader}.
 *
 * @param <I> The type of entity identifiers.
 */
public interface MassIdentifierSink<I> {

	/**
	 * Adds a batch of identifiers to the sink.
	 * <p>
	 * Identifiers can be passed in any order,
	 * but the caller must ensure that a given identifier is never passed more than once,
	 * even across multiple calls to this method.
	 * <p>
	 * The list only needs to stay usable until this method returns, as it will be copied.
	 * Afterwards, it can be discarded or reused at will.
	 * The identifiers themselves, however, must not change after this method is called,
	 * because they will be consumed asynchronously.
	 *
	 * @param batch The next batch of identifiers. Never {@code null}, never empty.
	 */
	void accept(List<? extends I> batch);

	/**
	 * Signals that no more identifiers are available.
	 */
	void complete();

}