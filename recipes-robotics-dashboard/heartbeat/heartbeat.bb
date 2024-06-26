# Auto-Generated by cargo-bitbake 0.3.16
#
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

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.21.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/1.1.3 \
    crate://crates.io/anyhow/1.0.82 \
    crate://crates.io/async-trait/0.1.80 \
    crate://crates.io/atomic/0.5.3 \
    crate://crates.io/autocfg/1.2.0 \
    crate://crates.io/backtrace/0.3.71 \
    crate://crates.io/base64/0.22.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.5.0 \
    crate://crates.io/bumpalo/3.16.0 \
    crate://crates.io/bytes/1.6.0 \
    crate://crates.io/cc/1.0.92 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cfg_aliases/0.1.1 \
    crate://crates.io/const-random-macro/0.1.16 \
    crate://crates.io/const-random/0.1.18 \
    crate://crates.io/core-foundation-sys/0.8.6 \
    crate://crates.io/core-foundation/0.9.4 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/dlv-list/0.5.2 \
    crate://crates.io/encoding_rs/0.8.34 \
    crate://crates.io/env_logger/0.10.2 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno/0.3.8 \
    crate://crates.io/fastrand/2.0.2 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.2.1 \
    crate://crates.io/futures-channel/0.3.30 \
    crate://crates.io/futures-core/0.3.30 \
    crate://crates.io/futures-sink/0.3.30 \
    crate://crates.io/futures-task/0.3.30 \
    crate://crates.io/futures-util/0.3.30 \
    crate://crates.io/getrandom/0.2.14 \
    crate://crates.io/gimli/0.28.1 \
    crate://crates.io/h2/0.4.4 \
    crate://crates.io/hashbrown/0.14.3 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/http-body-util/0.1.1 \
    crate://crates.io/http-body/1.0.0 \
    crate://crates.io/http/1.1.0 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-tls/0.6.0 \
    crate://crates.io/hyper-util/0.1.3 \
    crate://crates.io/hyper/1.2.0 \
    crate://crates.io/idna/0.5.0 \
    crate://crates.io/indexmap/2.2.6 \
    crate://crates.io/ipnet/2.9.0 \
    crate://crates.io/is-terminal/0.4.12 \
    crate://crates.io/itoa/1.0.11 \
    crate://crates.io/js-sys/0.3.69 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.153 \
    crate://crates.io/linux-raw-sys/0.4.13 \
    crate://crates.io/lock_api/0.4.11 \
    crate://crates.io/log/0.4.21 \
    crate://crates.io/memchr/2.7.2 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/miniz_oxide/0.7.2 \
    crate://crates.io/mio/0.8.11 \
    crate://crates.io/native-tls/0.2.11 \
    crate://crates.io/nix/0.28.0 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/object/0.32.2 \
    crate://crates.io/once_cell/1.19.0 \
    crate://crates.io/openssl-macros/0.1.1 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-src/300.2.3+3.2.1 \
    crate://crates.io/openssl-sys/0.9.102 \
    crate://crates.io/openssl/0.10.64 \
    crate://crates.io/ordered-multimap/0.7.3 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.9 \
    crate://crates.io/percent-encoding/2.3.1 \
    crate://crates.io/pin-project-internal/1.1.5 \
    crate://crates.io/pin-project-lite/0.2.14 \
    crate://crates.io/pin-project/1.1.5 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.30 \
    crate://crates.io/proc-macro2/1.0.79 \
    crate://crates.io/quote/1.0.36 \
    crate://crates.io/redox_syscall/0.4.1 \
    crate://crates.io/regex-automata/0.4.6 \
    crate://crates.io/regex-syntax/0.8.3 \
    crate://crates.io/regex/1.10.4 \
    crate://crates.io/reqwest/0.12.3 \
    crate://crates.io/rust-ini/0.21.0 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustix/0.38.32 \
    crate://crates.io/rustls-pemfile/2.1.2 \
    crate://crates.io/rustls-pki-types/1.4.1 \
    crate://crates.io/ryu/1.0.17 \
    crate://crates.io/schannel/0.1.23 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/security-framework-sys/2.10.0 \
    crate://crates.io/security-framework/2.10.0 \
    crate://crates.io/serde/1.0.197 \
    crate://crates.io/serde_derive/1.0.197 \
    crate://crates.io/serde_json/1.0.115 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/serde_yaml/0.9.34+deprecated \
    crate://crates.io/signal-hook-registry/1.4.1 \
    crate://crates.io/slab/0.4.9 \
    crate://crates.io/smallvec/1.13.2 \
    crate://crates.io/socket2/0.5.6 \
    crate://crates.io/syn/2.0.58 \
    crate://crates.io/sync_wrapper/0.1.2 \
    crate://crates.io/system-configuration-sys/0.5.0 \
    crate://crates.io/system-configuration/0.5.1 \
    crate://crates.io/tempfile/3.10.1 \
    crate://crates.io/termcolor/1.4.1 \
    crate://crates.io/tiny-keccak/2.0.2 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-macros/2.2.0 \
    crate://crates.io/tokio-native-tls/0.3.1 \
    crate://crates.io/tokio-util/0.7.10 \
    crate://crates.io/tokio/1.37.0 \
    crate://crates.io/tower-layer/0.3.2 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tower/0.4.13 \
    crate://crates.io/tracing-core/0.1.32 \
    crate://crates.io/tracing/0.1.40 \
    crate://crates.io/trim-in-place/0.1.7 \
    crate://crates.io/try-lock/0.2.5 \
    crate://crates.io/unicode-bidi/0.3.15 \
    crate://crates.io/unicode-ident/1.0.12 \
    crate://crates.io/unicode-normalization/0.1.23 \
    crate://crates.io/unsafe-libyaml/0.2.11 \
    crate://crates.io/url/2.5.0 \
    crate://crates.io/uuid/1.8.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/want/0.3.1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.92 \
    crate://crates.io/wasm-bindgen-futures/0.4.42 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.92 \
    crate://crates.io/wasm-bindgen-macro/0.2.92 \
    crate://crates.io/wasm-bindgen-shared/0.2.92 \
    crate://crates.io/wasm-bindgen/0.2.92 \
    crate://crates.io/web-sys/0.3.69 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.6 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.4 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.4 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.4 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.4 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.4 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.4 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.4 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.4 \
    crate://crates.io/winreg/0.52.0 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://heartbeat/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

SUMMARY = "Robotics Dashboard Device"
HOMEPAGE = "https://roboticsdashboard.com/"
LICENSE = "Apache-2.0"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include device-${PV}.inc
include device.inc
