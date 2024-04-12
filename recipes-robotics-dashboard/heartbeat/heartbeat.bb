SUMMARY = "Robotics Dashboard Heartbeat"
DESCRIPTION = "Sends a heartbeat to the central server"
HOMEPAGE = "http://roboticsdashboard.com"
SECTION = "core"
LICENSE = "CLOSED"

SRC_URI = "gitsm://github.com/Robotics-Dashboard/device.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"

inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get device could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/device/0.2.0"
SRC_URI += "gitsm://github.com/Robotics-Dashboard/device.git;protocol=https;nobranch=1;branch=main"
SRCREV = "b9463c72667586b1cc6fde62edd9ae8240691e2a"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = "heartbeat"
BB_STRICT_CHECKSUM = "0"
PV:append = ".AUTOINC+b9463c7266"
DEPENDS += " libssl-dev"

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

