 (defproject com.ladderlife/om-css "0.4.2"
  :description "Om Next + CSS"
  :url "http://github.com/ladderlife/om-css"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["clojars" {:sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]
                 [org.omcljs/om "1.0.0-alpha30"]
                 [garden "1.3.0"]

                 [figwheel-sidecar "0.5.0-6" :scope "test"]
                 [devcards "0.2.1-6" :scope "test"]
                 [devcards-om-next "0.1.1" :scope "test"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :source-paths ["src/main" "src/devcards" "src/test"]
  :clean-targets ^{:protect false} ["target"
                                    "resources/public/out"
                                    "resources/public/main.js"]
  :target-path "target")
