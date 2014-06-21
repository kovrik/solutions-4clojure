(defn binary-to-decimal [s]
  (let [pairs (map-indexed vector (map read-string (map str (reverse s))))]
    (apply + (map #(* (last %1) (reduce * (repeat (first %1) 2))) pairs))))


(= 0     (binary-to-decimal "0"))

(= 7     (binary-to-decimal "111"))

(= 8     (binary-to-decimal "1000"))

(= 9     (binary-to-decimal "1001"))

(= 255   (binary-to-decimal "11111111"))

(= 1365  (binary-to-decimal "10101010101"))

(= 65535 (binary-to-decimal "1111111111111111"))
