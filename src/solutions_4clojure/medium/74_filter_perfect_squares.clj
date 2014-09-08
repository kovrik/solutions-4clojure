; 74 - Filter Perfect Squares
(defn filter-perfect-squares [s]
  (letfn [(is-square? [n] (let [sqrt (Math/sqrt n)] (zero? (- sqrt (long sqrt)))))]
    (let [numbers (clojure.string/split s #",")]
      (clojure.string/join "," (filter #(is-square? %) (map read-string numbers))))))

(= (filter-perfect-squares "4,5,6,7,8,9") "4,9")

(= (filter-perfect-squares "15,16,25,36,37") "16,25,36")
