package org.ecos.logic.serenity_intro.operation;

import lombok.Getter;

@Getter
public class Operation {
    protected OperationTypes operationType = OperationTypes.GET;
    protected String endpoint = "";
    protected String contentType = "application/json";
    protected String domain = "";
}
