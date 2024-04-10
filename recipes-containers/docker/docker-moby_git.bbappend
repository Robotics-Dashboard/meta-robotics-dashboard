inherit systemd

SYSTEMD_SERVICE:${PN} = "docker.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"
