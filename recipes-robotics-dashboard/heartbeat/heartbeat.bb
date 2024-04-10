SUMMARY = "Robotics Dashboard Heartbeat"
DESCRIPTION = "Sends a heartbeat to the central server"
HOMEPAGE = "http://roboticsdashboard.com"
SECTION = "core"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/yourusername/yourproject.git;protocol=https"
# Specify the branch, tag, or commit you want to fetch
SRCREV = "master"

# Inherit cargo to use cargo class for building Rust projects
inherit cargo

S = "${WORKDIR}/git"

# Specify Rust dependencies in DEPENDS if there are any
DEPENDS = ""
RDEPENDS_${PN} = ""

do_compile() {
    cargo build --release
}

do_install() {
    install -d ${D}${bindir}/
    install -m 0755 target/release/yourproject ${D}${bindir}/
}

FILES_${PN} += "${bindir}/yourproject"

