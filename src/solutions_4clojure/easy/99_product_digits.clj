;; ugly

(defn pd [x y]
  (map (fn [n] (- n 48)) (map int (char-array (str (* x y))))))


(= (pd 1 1) [1])

(= (pd 99 9) [8 9 1])

(= (pd 999 99) [9 8 9 0 1])
