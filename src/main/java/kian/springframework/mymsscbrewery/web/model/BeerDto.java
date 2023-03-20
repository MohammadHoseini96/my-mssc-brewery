package kian.springframework.mymsscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    public static BeerDtoBuilder builder() {
        return new BeerDtoBuilder();
    }

    public UUID getId() {
        return this.id;
    }

    public String getBeerName() {
        return this.beerName;
    }

    public String getBeerStyle() {
        return this.beerStyle;
    }

    public Long getUpc() {
        return this.upc;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BeerDto)) return false;
        final BeerDto other = (BeerDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$beerName = this.getBeerName();
        final Object other$beerName = other.getBeerName();
        if (this$beerName == null ? other$beerName != null : !this$beerName.equals(other$beerName)) return false;
        final Object this$beerStyle = this.getBeerStyle();
        final Object other$beerStyle = other.getBeerStyle();
        if (this$beerStyle == null ? other$beerStyle != null : !this$beerStyle.equals(other$beerStyle)) return false;
        final Object this$upc = this.getUpc();
        final Object other$upc = other.getUpc();
        if (this$upc == null ? other$upc != null : !this$upc.equals(other$upc)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BeerDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $beerName = this.getBeerName();
        result = result * PRIME + ($beerName == null ? 43 : $beerName.hashCode());
        final Object $beerStyle = this.getBeerStyle();
        result = result * PRIME + ($beerStyle == null ? 43 : $beerStyle.hashCode());
        final Object $upc = this.getUpc();
        result = result * PRIME + ($upc == null ? 43 : $upc.hashCode());
        return result;
    }

    public String toString() {
        return "BeerDto(id=" + this.getId() + ", beerName=" + this.getBeerName() + ", beerStyle=" + this.getBeerStyle() + ", upc=" + this.getUpc() + ")";
    }

    public static class BeerDtoBuilder {
        private UUID id;
        private String beerName;
        private String beerStyle;
        private Long upc;

        BeerDtoBuilder() {
        }

        public BeerDtoBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public BeerDtoBuilder beerName(String beerName) {
            this.beerName = beerName;
            return this;
        }

        public BeerDtoBuilder beerStyle(String beerStyle) {
            this.beerStyle = beerStyle;
            return this;
        }

        public BeerDtoBuilder upc(Long upc) {
            this.upc = upc;
            return this;
        }

        public BeerDto build() {
            return new BeerDto(id, beerName, beerStyle, upc);
        }

        public String toString() {
            return "BeerDto.BeerDtoBuilder(id=" + this.id + ", beerName=" + this.beerName + ", beerStyle=" + this.beerStyle + ", upc=" + this.upc + ")";
        }
    }
}
