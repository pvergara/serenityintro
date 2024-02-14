package org.ecos.logic.serenity_intro.operation;

public class AutomationExerciseOperation extends Operation{

    public static AutomationExerciseOperation DELETE = new AutomationExerciseOperation(OperationTypes.DELETE,"/deleteAccount", "multipart/form-data");

    public AutomationExerciseOperation(OperationTypes operationType, String endpoint, String contentType) {
        this.domain = "https://automationexercise.com/api";
        this.operationType = operationType;
        this.endpoint = endpoint;
        this.contentType = contentType;
    }
}
