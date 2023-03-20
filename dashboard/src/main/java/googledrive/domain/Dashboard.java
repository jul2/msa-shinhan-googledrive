package googledrive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String fileName;
    private Float fileSize;
    private String filePath;
    private String fileType;
    private Boolean isIndexed;
    private Boolean isUploaded;
    private String fileUrl;
}
