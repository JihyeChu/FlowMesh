package com.jv_cc.flowmesh.hub_server.presentation.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReqHubPostDTO {

    @JsonProperty(value = "manager_id")
    @NotNull(message = "허브 담당자를 입력해주세요.")
    private Long managerId;

    @NotBlank(message = "허브 이름을 입력해주세요.")
    private String name;

    @NotBlank(message = "허브 주소를 입력해주세요.")
    private String address;

    @NotNull(message = "허브 위도를 입력해주세요.")
    private double latitude;

    @NotNull(message = "허브 경도를 입력해주세요.")
    private double longitude;

}
