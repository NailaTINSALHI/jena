/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.sparql.core;

import org.apache.jena.query.ReadWrite ;

/** The "un-Transactional" interface */ 
public interface TransactionalNotSupported extends Transactional
{
    // And sometimes implements wil have to include this code directly
    // to override super class versions.  
    
    @Override
    public default void begin(ReadWrite readWrite)
    { throw new UnsupportedOperationException("Transactional.begin") ; }

    @Override
    public default void commit()
    { throw new UnsupportedOperationException("Transactional.commit") ; }

    @Override
    public default void abort()
    { throw new UnsupportedOperationException("Transactional.abort") ; }

    @Override
    public default boolean isInTransaction()
    { return false ; }

    @Override
    public default void end()
    { throw new UnsupportedOperationException("Transactional.end") ; }
}
