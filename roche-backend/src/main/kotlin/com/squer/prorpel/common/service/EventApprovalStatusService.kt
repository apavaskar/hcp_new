package com.squer.prorpel.common.service

import com.squer.prorpel.common.domain.EventApprovalStatus

interface EventApprovalStatusService {
    fun updateCreatedBy(oldId: String, newId: String)

    fun updateUpdatedBy(oldId: String, newId: String)

    fun updateActionBy(oldId: String, newId: String)

    fun create(entity: EventApprovalStatus): String
}