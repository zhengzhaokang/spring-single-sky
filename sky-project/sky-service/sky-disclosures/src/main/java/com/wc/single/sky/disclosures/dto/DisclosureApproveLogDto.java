package com.wc.single.sky.disclosures.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "disclosure_approve_log")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DisclosureApproveLogDto {

    @Id
    private Long id;

    private String approveUuid;

    private String disclosuresId;

    private String disclosureNumber;

    private String approver;

    private Date approveTime;

    private String assignee;

    private String completed;

    private String delFlag;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

}
