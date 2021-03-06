/*
 * Copyright 2012-2016 Aerospike, Inc.
 *
 * Portions may be licensed to Aerospike, Inc. under one or more contributor
 * license agreements WHICH ARE COMPATIBLE WITH THE APACHE LICENSE, VERSION 2.0.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.aerospike.client.policy;

/**
 * How to handle writes when the record already exists.
 */
public enum RecordExistsAction {
	/**
	 * Create or update record.
	 * Merge write command bins with existing bins.
	 */
	UPDATE,

	/**
	 * Update record only. Fail if record does not exist.
	 * Merge write command bins with existing bins.
	 */
	UPDATE_ONLY,
	
	/**
	 * Create or replace record.
	 * Delete existing bins not referenced by write command bins.
	 * Supported by Aerospike server versions >= 3.1.6.
	 */
	REPLACE,
	
	/**
	 * Replace record only. Fail if record does not exist.
	 * Delete existing bins not referenced by write command bins.
	 * Supported by Aerospike server versions >= 3.1.6.
	 */
	REPLACE_ONLY,

	/**
	 * Create only.  Fail if record exists. 
	 */
	CREATE_ONLY
}
