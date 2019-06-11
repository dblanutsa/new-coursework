package dmitriy.blanutsa.coursework.controllers.dto;import dmitriy.blanutsa.coursework.persistance.models.enums.CarType;import javax.validation.constraints.NotBlank;import javax.validation.constraints.NotNull;import java.io.Serializable;public class ModelRequest implements Serializable {    private static final long serialVersionUID = 643192095319219778L;    @NotBlank(message = "Name is required")    private String name;    @NotBlank(message = "Description is required")    private String description;    @NotNull(message = "Manufacturer is required")    private Integer manufacturerId;    @NotNull(message = "Type is required")    private CarType type;    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public String getDescription() {        return description;    }    public void setDescription(String description) {        this.description = description;    }    public Integer getManufacturerId() {        return manufacturerId;    }    public void setManufacturerId(Integer manufacturerId) {        this.manufacturerId = manufacturerId;    }    public CarType getType() {        return type;    }    public void setType(CarType type) {        this.type = type;    }}