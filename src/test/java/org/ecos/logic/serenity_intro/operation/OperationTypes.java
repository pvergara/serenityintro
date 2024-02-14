package org.ecos.logic.serenity_intro.operation;

public enum OperationTypes {
    GET,
    POST,
    PUT,
    DELETE;

    OperationTypes() {}

    public String getOperationName() {
        return this.name();
    }
}
