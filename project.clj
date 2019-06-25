(defproject music-for-programming "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.520"]]

  :plugins [[lein-figwheel "0.5.18"]]

  :cljsbuild {:builds
              [{:id "dev"
                :figwheel true
                :source-paths ["src" "test"]
                :compiler {:main mfp.core
                           :optimizations :none
                           :output-dir "resources/public/js/out"
                           :asset-path "js/out"
                           :output-to "resources/public/js/app.js"}}]})

