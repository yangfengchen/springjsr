package com.ddzj.vo;

import com.ddzj.valiadator.IsMobile;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * <p>
 *
 * </p>
 *
 * <p>
 * Copyright: 2019 . All rights reserved.
 * </p>
 * <p>
 * Company: Zsoft
 * </p>
 * <p>
 * CreateDate:2019-07-03
 * </p>
 *
 * @author pc
 * @history Mender:pc；Date:2019-07-03；
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {

    @NotNull
    @Length(max = 3, message = "长度超过3不要！")
    private String name;

    @NotNull
    @IsMobile(requried = false)
    private String phone;

}
