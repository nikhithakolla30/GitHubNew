package com.dailycodebuffer.user.VO;

import com.dailycodebuffer.user.entity.User1;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private User1 user;
    private Department department;
}
