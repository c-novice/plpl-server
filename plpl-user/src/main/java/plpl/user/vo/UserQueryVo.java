package plpl.user.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author lzq
 */
@Data
public class UserQueryVo {
    private Integer power;
    private String username;
    private String phoneNumber;
    private Integer ageLeft;
    private Integer ageRight;
    private Date birthday;
    private Integer gender;
}
