package orderProject.project.domain;

import orderProject.project.domain.item.Item;

import javax.persistence.*;
import java.util.Locale;

import static javax.persistence.FetchType.*;

@Entity
public class CategoryItem {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

}
