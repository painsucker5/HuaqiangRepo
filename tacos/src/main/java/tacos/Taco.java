package tacos;

/**
 * Created with IntelliJ IDEA.
 *
 * @author BingShuai Liu
 * @date 2021/09/23/14:33
 * @description
 */
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Taco {

    private String name;

    private Date createdAt;

    private List<Ingredient> ingredients;

}