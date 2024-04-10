SUMMARY = "Robotics Dashboard Heartbeat"
DESCRIPTION = "Sends a heartbeat to the central server"
HOMEPAGE = "http://roboticsdashboard.com"
SECTION = "core"
LICENSE = "CLOSED"

SRC_URI = "gitsm://github.com/Robotics-Dashboard/device.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"

inherit cargo

S = "${WORKDIR}/git"

DEPENDS = ""
RDEPENDS_${PN} = ""

do_configure:prepend() {
  cd ${WORKDIR}/git
  git submodule update --init --recursive
  cd -
}

do_compile() {
    cargo build --release
}

do_install() {
    install -d ${D}${bindir}/
    install -m 0755 target/release/heartbeat ${D}${bindir}/
}

FILES_${PN} += "${bindir}"

