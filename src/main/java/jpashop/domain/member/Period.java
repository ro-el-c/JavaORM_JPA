package jpashop.domain.member;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class Period {
    private LocalDate startDate;
    private LocalDate endDate;

    public Period() {
    }

    public Period(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
