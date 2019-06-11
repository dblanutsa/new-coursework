package dmitriy.blanutsa.coursework.controllers.dto;import javax.validation.constraints.NotBlank;import javax.validation.constraints.NotNull;import java.io.Serializable;public class CarRequest implements Serializable {    private static final long serialVersionUID = -2134009399202963083L;    @NotBlank(message = "Number is required")    private String number;    @NotNull(message = "Model is required")    private Integer modelId;    public String getNumber() {        return number;    }    public void setNumber(String number) {        this.number = number;    }    public Integer getModelId() {        return modelId;    }    public void setModelId(Integer modelId) {        this.modelId = modelId;    }}