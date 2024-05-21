package swe.backend.dadlock.dto.webapp;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import swe.backend.dadlock.entity.WebApp;

public class WebAppResponseDTO {

    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @Getter
    public static class CommonDTO {
        private Long id;
        private String appUrl;
        private int timeLimit;

        public CommonDTO(WebApp webApp) {
            this.id = webApp.getId();
            this.appUrl = webApp.getAppUrl();
            this.timeLimit = webApp.getTimeLimit();
        }
    }
}
