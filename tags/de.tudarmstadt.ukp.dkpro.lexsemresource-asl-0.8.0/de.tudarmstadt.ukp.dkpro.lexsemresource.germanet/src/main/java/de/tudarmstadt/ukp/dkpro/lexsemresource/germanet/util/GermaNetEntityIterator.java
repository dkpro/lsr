/*******************************************************************************
 * Copyright 2012
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.txt
 ******************************************************************************/
package de.tudarmstadt.ukp.dkpro.lexsemresource.germanet.util;

import java.util.Iterator;

import de.tudarmstadt.ukp.dkpro.lexsemresource.Entity;
import de.tudarmstadt.ukp.dkpro.lexsemresource.LexicalSemanticEntityIterator;
import de.tuebingen.uni.sfs.germanet.api.Synset;

public class GermaNetEntityIterator extends LexicalSemanticEntityIterator {

	private Iterator<Synset> synsets;
	
	public GermaNetEntityIterator(Iterator<Synset> synsets){
		this.synsets = synsets;
	}

    @Override
	public boolean hasNext() {
		return synsets.hasNext();
	}

	@Override
	public Entity next() {
        Synset synset = (Synset) synsets.next();
        return GermaNetUtils.synsetToEntity(synset);
	}
}
