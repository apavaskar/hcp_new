/*
 * This file is generated by jOOQ.
 */
package com.squer.prorpel.jooq.sequences


import com.squer.prorpel.jooq.Public

import org.jooq.Sequence
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType



/**
 * The sequence <code>public.batch_job_execution_seq</code>
 */
val BATCH_JOB_EXECUTION_SEQ: Sequence<Long> = Internal.createSequence("batch_job_execution_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null)

/**
 * The sequence <code>public.batch_job_seq</code>
 */
val BATCH_JOB_SEQ: Sequence<Long> = Internal.createSequence("batch_job_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null)

/**
 * The sequence <code>public.batch_step_execution_seq</code>
 */
val BATCH_STEP_EXECUTION_SEQ: Sequence<Long> = Internal.createSequence("batch_step_execution_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null)
