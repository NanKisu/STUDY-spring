package com.study.webapp.valiation.dto;

import java.util.List;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class SizeInDto {
  @Size(min = 3, max = 5)
  private List<String> var;
}
