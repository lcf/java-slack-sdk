package com.slack.api.bolt.handler.builtin;

import com.slack.api.bolt.context.builtin.WorkflowStepEditContext;
import com.slack.api.bolt.handler.Handler;
import com.slack.api.bolt.request.builtin.WorkflowStepEditRequest;
import com.slack.api.bolt.response.Response;

@FunctionalInterface
@Deprecated
public interface WorkflowStepEditHandler extends Handler<WorkflowStepEditContext, WorkflowStepEditRequest, Response> {
}
