# Dependabot Bazel Test Repository

Test repository to evaluate Dependabot's beta Bazel support.

## Setup

This repository intentionally uses **outdated dependencies** to test Dependabot:

- `bazel_skylib`: 1.5.0 (current: 1.8.2)
- `rules_java`: 7.0.0 (current: 8.16.1)
- `rules_jvm_external`: 6.0 (current: 6.9)
- `rules_python`: 0.31.0 (current: 1.6.3)
- `guava`: 32.0.0-jre (current: 33.4.0-jre)
- `junit`: 4.12 (current: 4.13.2)
- `commons-lang3`: 3.12.0 (current: 3.19.0)

## Expected Behavior

Dependabot should create PRs to update these dependencies. Key test points:

1. **Bazel rules updates**: Can Dependabot update `bazel_dep` declarations?
2. **Maven artifact updates**: Can it update Maven dependencies in `maven.install()`?
3. **Grouping**: Do dependency groups work to reduce PR noise?
4. **Lock files**: Will it attempt to update `maven_install.json`? (Not supported yet)

## Building

Generate the lock file first:
```bash
bazel run @maven//:pin
bazel test //...
```

## Results

Track Dependabot PRs and behavior here as they arrive.
